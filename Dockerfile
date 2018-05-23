# Modified by Chenthilraj
FROM python:2.7
WORKDIR /var/lcr/dbs
COPY . ./
RUN pip install -r requirements.txt
RUN pip install pika
#RUN dism.exe /online /enable-feature /all /featurename:rabbitmq /NoRestart
#RUN dism.exe /online /enable-feature /all /featurename:notepad++ /NoRestar
RUN mkdir -p /usr/local/work/lcr/test
ENV EXTRACTDIR /usr/local/work/lcr/test
WORKDIR /var/lcr/dbs/src
CMD [ "python", "sample.py" ]