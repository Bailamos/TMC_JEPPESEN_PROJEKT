import requests

EXPECTED_GATES = [
    {u'lat': u'54.3813476', u'lon': u'18.4664826', u'id': u'3050042783'},
    {u'lat': u'54.3814913', u'lon': u'18.4658952', u'id': u'3050042784'},
    {u'lat': u'54.3816382', u'lon': u'18.4653212', u'id': u'3050042786'},
    {u'lat': u'54.3812070', u'lon': u'18.4670700', u'id': u'3050042787'}
]


def test_get_gates():
    res = requests.get('http://localhost:5000/getGates')
    assert res.json() == EXPECTED_GATES


def test_chose_gate():
    data = {'id': 1}
    res = requests.post('http://localhost:5000/setChosenGate', json=data)
    assert res.json() == data


def test_chose_gate_and_get():
    data = {'id': 1}
    _ = requests.post('http://localhost:5000/setChosenGate', json=data)
    res = requests.get('http://localhost:5000/getChosenGate')
    assert res.json() == data


def test_chose_gate_twice():
    first_data = {'id': 1}
    _ = requests.post('http://localhost:5000/setChosenGate', json=first_data)
    second_data = {'id': 2}
    _ = requests.post('http://localhost:5000/setChosenGate', json=second_data)
    res = requests.get('http://localhost:5000/getChosenGate')
    assert res.json() == second_data
